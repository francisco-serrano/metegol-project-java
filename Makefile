# Local development commands
run:
	docker-compose up --build

run-tests:
	docker-compose run api mvn test

build-prod:
	docker build -t franciscoserrano/metegol-project:latest .

run-prod:
	docker run -p 8080:8080 franciscoserrano/metegol-project
