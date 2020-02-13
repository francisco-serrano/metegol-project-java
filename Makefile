run:
	docker-compose up --build

build-test:
	docker build -t franciscoserrano/metegol-project-test -f ./Dockerfile.dev

run-test:
	docker run franciscoserrano/metegol-project-test mvn test

build-prod:
	docker build -t franciscoserrano/metegol-project .

run-prod:
	docker run -p 8080:8080 franciscoserrano/metegol-project
