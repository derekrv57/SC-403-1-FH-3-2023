paused = true;
index = 0;
currentAudio = null;

function redirect(url) {
	window.location.href = url;
} 

function play(i) {
	index = i;
	pause();
	if (index < audioElements.length) {
		currentAudio = audioElements[index];
		currentAudio.play();
		paused = false;
		document.getElementById("lblSong").textContent = currentAudio.id;
		document.getElementById("imgPlay").src = "assets/img/pause.svg";
		currentAudio.addEventListener('ended', function() {
			currentAudio.pause();
			play(index + 1);
		});
	}
	else{
		alert("Out of index");
	}
}

function pause() {
	try {
		currentAudio.pause();
		document.getElementById("imgPlay").src = "assets/img/play.svg";
		paused = true;
	} catch (e) {
	}
}

function playpause(){
	if (paused) {
		play(index);
	}
	else{
		pause();
	}
}

function next(){
	try {
		play(index + 1);
	} catch (e) {
	}
}

function back(){
	try {
		play(index - 1);
	} catch (e) {
	}
}

function getAudioElements() {
	const audioIds = document.querySelectorAll('audio');
	const audioArray = Array.from(audioIds);
	return audioArray;
}

function loadElements(){
	audioElements = getAudioElements();
	currentAudio = null;
        var menuItems = document.querySelectorAll("#menu a");
        var currentURL = window.location.pathname;
}