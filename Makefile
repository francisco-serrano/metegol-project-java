run:
	docker-compose up --build

build-test:
	docker build -t franciscoserrano/metegol-project-test -f ./Dockerfile.dev .

run-test:
	docker run franciscoserrano/metegol-project-test mvn test

build-deploy:
	docker build -t franciscoserrano/metegol-project:latest -t franciscoserrano/metegol-project:$SHA .
	echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_ID" --password-stdin
	docker push franciscoserrano/metegol-project:latest
	docker push franciscoserrano/metegol-project:$SHA

build-prod:
	docker build -t franciscoserrano/metegol-project .

run-prod:
	docker run -p 8080:8080 franciscoserrano/metegol-project
