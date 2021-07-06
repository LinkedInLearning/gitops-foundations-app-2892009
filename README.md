# GitOps Foundations
This is the repository for the LinkedIn Learning course GitOps Foundations. The full course is available from [LinkedIn Learning][lil-course-url].

![GitOps Foundations][lil-thumbnail-url] 

If there is one constant in the software industry, it is the need for both speed and accuracy. GitOps can help fill both needs. GitOps is an operational model that extends DevOps with additional concepts that allow teams to accelerate the delivery of cloud native applications in a manner that is more consistent, reliable, transparent, and secure. In this course, instructor Kevin Bowersox walks you through the basics of the GitOps pattern, its key principles, and its practical use. Using hands-on demonstrations with Kubernetes, Kevin explains building blocks such as declarative configuration, automated change delivery, reconciliation, and more. Throughout the course, you’ll be introduced to a variety of tools you can use that take a GitOps approach, including Terraform, Argo CD, Flux, and Flagger.


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

### Instructor

Kevin Bowersox 
                            
Web application developer

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/kevin-bowersox).

[lil-course-url]: https://www.linkedin.com/learning/gitops-foundations
[lil-thumbnail-url]: https://cdn.lynda.com/course/2892009/2892009-1625008421822-16x9.jpg

[0]: # (Replace these placeholder URLs with actual course URLs)

[docker-hub]: https://hub.docker.com/
[config-repo]: https://github.com/LinkedInLearning/gitops-foundations-env-2892009
[docker-install]: https://docs.docker.com/engine/install/

