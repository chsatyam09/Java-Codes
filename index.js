const data = null;

const xhr = new XMLHttpRequest();
xhr.withCredentials = true;

xhr.addEventListener('readystatechange', function () {
	if (this.readyState === this.DONE) {
		console.log(this.responseText);
	}
});

xhr.open('GET', 'https://imdb-top-100-movies.p.rapidapi.com/');
xhr.setRequestHeader('x-rapidapi-key', 'e05726ea41mshf8633ec49633cb5p1fe816jsnb76ecf0ce938');
xhr.setRequestHeader('x-rapidapi-host', 'imdb-top-100-movies.p.rapidapi.com');

xhr.send(data);