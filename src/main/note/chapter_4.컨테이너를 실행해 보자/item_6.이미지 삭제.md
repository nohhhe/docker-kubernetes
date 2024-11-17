아이템 6.이미지 삭제
=========================
## ⭕ 이미지 삭제
컨테이너를 삭제해도 이미지는 그대로 남아 있기 때문에 별도로 삭제를 해야한다.

### ◉ docker image rm 커맨드
이미지를 삭제하기 위해서는 docker image rm 커맨드를 사용한다.
> docker image rm [옵션] 이미지_이름[:태그]

##### ❗️현재 컨테이너가 사용 중인 이미지를 삭제하려고 하면 오류가 발생한다.

### ◉ docker image ls 커맨드
현재 내려받은 이미지 목록을 확인하기 위해서는 docker image ls 커맨드를 사용한다.
> docker image ls

### ◉ 이미지 목록의 정보
| 항목 | 내용 |
|-----|-----|
| REPOSITORY | 이미지 이름 |
| TAG | 이미지 버전 |
| IMAGE ID | 이미지 ID |
| CREATED | 이미지 생성 후 경과된 시간 |
| SIZE | 이미지 크기 |

#### ✦ 이미지 버전
이미지 버전을 지정하지 않으면 최신 버전(latest 태그)를 내려받는다. 구성에 따라 특정 버전을 사용해야할 때는 이미지 이름 뒤에 콜론(:)을 사용해 버전을 지정한다.
> docker run --name apa000ex2 -d -p 8080:80 httpd:2.2

#### ✦ 이미지의 짧은 형식 명령어
* docker image rm: docker rmi
* docker image ls: docker images
* docker image pull: docker pull
* docker image build: docker build
* docker image inspect: docker inspect

하지만 container 명령어 처럼 옛날 방식이기 때문에 상위 커맨드까지 사용하는 것이 좋다.

#### ✦ 사용하지 않는 이미지 모두 삭제
prune 옵션을 사용하면 사용하지 않는 중간 이미지(임시 이미지)를 삭제할 수 있고 -a 옵션을 사용하면 사용하지 않는 모든 실제 이미지를 삭제할 수 있다.
> docker image prune -a

##### 중간 이미지란?
도커 이미지의 빌드 과정에서 생성되는 이미지로 생성 후에는 사용하지 않는 이미지를 말한다. 중간 이미지는 최적화로 인해 자동으로 최종 이미지가 생성되면 삭제된다.
