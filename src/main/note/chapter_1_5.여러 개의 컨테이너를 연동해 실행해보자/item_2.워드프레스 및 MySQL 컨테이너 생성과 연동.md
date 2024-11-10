아이템 2.워드프레스 및 MySQL 컨테이너 생성과 연동
=========================
## ⭕이번 절의 실습 내용과 사용할 커맨드
워드프레스 컨테이너와 MySQL 컨테이너를 생성하고 실행한다.

### ◉실습 내용
네트워크 생성 -> MySQL 컨테이너 생성 -> 워드프레스 컨테이너 생성 -> 컨테이너 및 네트워크 확인 -> 뒷정리

### ◉생성할 네트워크 및 컨테이너 정보
| 항목 | 값 |
|----|----|
| 네트워크 이름 | wordpress000net1 |
| MySQL 컨테이너 이름 | mysql000ex11 |
| MySQL 이미지 이름 | mysql |
| 워드프레스 컨테이너 이름 | wordpress000ex12 |
| 워드프레스 이미지 이름 | wordpress |

### ◉워드프레스와 MySQL 컨테이너 생성 및 실행
1. network create 커맨드를 사용해 네트워크 생성
> docker network create wordpress000net1

2. run 커맨드로 MySQL 컨테이너 생성 및 실행
> docker run --name mysql000ex11 -dit --net=wordpress000net1 -e MYSQL_ROOT_PASSWORD=myrootpass -e MYSQL_DATABASE=wordpress000db -e MYSQL_USER=wordpress -e MYSQL_PASSWORD=wkunpass mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --default-authentication-plugin=mysql_native_password

##### ❗️도커 컨테이너 로그 보는법
> docker logs mysql000ex11

##### ❗️default-authentication-plugin 옵션은 MySQL 9.1.0 버전에서는 더 이상 사용되지 않는다.

변경된 커맨드
> docker run --name mysql000ex11 -dit --net=wordpress000net1 -e MYSQL_ROOT_PASSWORD=myrootpass -e MYSQL_DATABASE=wordpress000db -e MYSQL_USER=wordpress -e MYSQL_PASSWORD=wkunpass mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

3. run 커맨드로 워드프레스 컨테이너 생성 및 실행
> docker run --name wordpress000ex12 -dit --net=wordpress000net1 -p 8085:80 -e WORDPRESS_DB_HOST=mysql000ex11:3306 -e WORDPRESS_DB_NAME=wordpress000db -e WORDPRESS_DB_USER=wordpress -e WORDPRESS_DB_PASSWORD=wkunpass wordpress

4. ps 커맨드로 컨테이너의 상태 확인
> docker ps

5. 웹 브라우저를 통해 워드프레스에 접근해 확인
> http://localhost:8085

6. 뒷정리
컨테이너/이미지/네트워크 종료 및 삭제
> docker stop mysql000ex11 wordpress000ex12
> docker rm mysql000ex11 wordpress000ex12
> docker rmi mysql wordpress
> docker network rm wordpress000net1
> docker ps -a
