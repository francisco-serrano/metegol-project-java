run:
	docker-compose up --build

build-prod:
	docker build -t franciscoserrano/metegol-project .

run-prod:
	docker run -p 8080:8080 franciscoserrano/metegol-project
