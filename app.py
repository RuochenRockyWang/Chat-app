from flask import Flask, request, jsonify
from gtts import gTTS
import subprocess
import os

app = Flask(__name__)

@app.route('/textToVideo', methods=['POST'])
def generate_video():
    text = request.json.get('text')

    if text is None:
        return jsonify({'error': 'No text provided'}), 400

    # Use gTTS to convert text to speech
    tts = gTTS(text=text, lang='en')
    tts.save("audio.mp3")
    print("Audio saved")

    # run command line 
    command = [
        "python3", "inference.py",
        "--checkpoint_path", "checkpoints/wav2lip.pth",
        "--face", "video.mp4",
        "--audio", "audio.mp3",
        "--outfile", "results.mp4",
    ]
    print("Running command: %s" % " ".join(command))
    subprocess.run(command, check=True)

    return jsonify({'message': 'Video generated successfully'}), 200


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
