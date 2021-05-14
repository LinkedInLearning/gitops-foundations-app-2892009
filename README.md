# GitOps Foundations
This is the repository for the LinkedIn Learning course `GitOps Foundations`. The full course is available from [LinkedIn Learning][lil-course-url].

![course-name-alt-text][lil-thumbnail-url] 

This repository contains the source code for the sample application that runs inside of a container image.  During the course setup, you'll need to build the image from source and place it within an artifact repository, which in this case is DockerHub.  In a GitOps workflow, this repository would be used to make changes to the application such as adding new features or bug fixes.  These changes would be built into a packaged software artifact that is further packaged into a container image for operations to pull from the artifact repository.  This segment of the workflow is traditionally well established via continuous integration practices, whereas GitOps is more focused on the delivery and deployment of containers as expressed in the desired state.  

The desired state is most often held in a separate repository, known as a config or environment repository, that holds infrastructure code.  For this course, you'll find an accompanying [config reposity][config-repo] where you'll primarily work throughout the course to complete GitOps workflows. 

The application was developed with the following technologies, however they are not necessary for the course:
1. Java
2. Spring Framework
3. Maven

## Installing
1. To use these exercise files, you must have the following accounts:
	- **DockerHub** is used to store container images that will be ran throughout the course in specific examples.  Create an account on the [DockerHub][docker-hub] website.
2. To use these exercise files, you must have the following installed:
	- **Docker** is used as the underlying container platform for building and running containers.  You can download and install Docker for your platform using the [official installation guide][docker-install].
4. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
5. After cloning the repository, login to Docker with the following command `docker login`.
6. Once logged into DockerHub execute the `create_images.sh` script with the following command `./create_images.sh [DockerHub Username]`.


[0]: # (Replace these placeholder URLs with actual course URLs)

[lil-course-url]: https://www.linkedin.com/learning/
[lil-thumbnail-url]: http://
[docker-hub]: https://hub.docker.com/
[config-repo]: https://github.com/LinkedInLearning/gitops-foundations-env-2892009
[docker-install]: https://docs.docker.com/engine/install/

