아이템 1.워드프레스 구축
=========================
## ⭕ 워드 프레스 사이트 구성 및 구축
워드프레스는 웹 사이트를 만들기 위한 소프트웨어로 서버에 설치해 사용한다.

---

## ⭕ 도커 네트워크 생성/삭제
워드포레스는 워드프레스 컨테이너와 MySQL 컨테이너로 구성된다. 두 컨테이너는 도커 네트워크를 통해 연결된다.

### ◉ 도커 네트워크를 생성하는 커맨드
도커 네트워크를 생성하는 커맨드는 옵션이나 인자를추가하는 경우는 거의 없다. 너트웨크를 생성한 다음 컨테이너에서 네트워크에 접속하게 설정한다.
> docker network create [네트워크명]

### ◉ 도커 네트워크를 삭제하는 커맨드
도커 네트워클르 삭제하는 커맨드도 옵션이나 인자를 추가하는 경우는 거의 없다.
> docker network rm [네트워크명]

### ◉ 그 외 도커 네트워크 관련 커맨드
| 커맨드 | 내용                              | 생략 가능 여부 | 주요 옵션      |
|----|---------------------------------|----|------------|
| connect | 네트워크에 컨테이너를 새로이 접속              | X | 거의 사용하지 않음 |
| disconnect | 네트워크에서 컨테이너의 접속을 끊음             | X | 거의 사용하지 않음 |
| create | 네트워크를 생성                        | X | 거의 사용하지 않음 |
| inspect | 네트워크 상세 정보를 확인                  | X | 거의 사용하지 않음 |
| ls | 네트워크 목록을 확인                     | X | 거의 사용하지 않음 |
| prune | 현재 아무 컨테이너도 접속하지 않은 네트워크를 모두 삭제 | X | 거의 사용하지 않음 |
| rm | 지정한 워크를 삭제                      | X | 거의 사용하지 않음 |

## ⭕ MySQL 컨테이너 실행 시에 필요한 옵션과 인자
자주 사용하는 커맨드 예
> docker run --name 컨테이너_이름 -dit --net=네트워크_이름 -e MYSQL_ROOT_PASS_WORD=MySQL_루트_패스워드 -e MYSQL_DATABASE=데이터베이스_이름 -e MYSQL_USER=사용자이름 -e MYSQL_PASSWORD=MySQL_패스워드 mysql --character-set-server=문자_인코딩 --collation-server=정렬_순서 --default-authentication-plugin=인증_방식

### ◉ 사용된 옵션
| 항목            | 옵션     | 실습에서 사용하는 값      |
|---------------|--------|------------------|
| 네트워크 이름       | --net  | wordpress000net1 |
| MySQL 컨테이너 이름 | --name | mysql000ex11     |
| 실행 옵션 | --dit | -                |
| MySQL 루트 패스워드 | -e MYSQL_ROOT_PASSWORD | myrootpass       |
| MySQL 데이터베이스 이름 | -e MYSQL_DATABASE | wordpress000db   |
| MySQL 사용자 이름 | -e MYSQL_USER | wrodpress000kun  |
| MySQL 패스워드 | -e MYSQL_PASSWORD | wkunpass         |

패스워드는 루트 패스워드와 일반 사용자 패스워드 두 가지를 설정한다.
루트는 모든 권한을 가진 사용이며 보안 측면에 문제가 생길 수 있으니 제한된 권한을 가진 일반 사용자로 전환하는 것이 일반적인 원칙이다.

### ◉ 사용된 인자
| 항목 | 인자 | 값 | 의미                        |
|----|----|----|---------------------------|
| 문자 인코딩 | --character-set-server | utf8mb4 | 문자 인코딩으로 UTF8을 사용         |
| 정렬 순서 | --collation-server | utf8mb4_unicode_ci | 정렬 순서로 UTF8을 따름           |
| 인증 방식 | --default-authentication-plugin | mysql_native_password | 인증 방식을 예전 방식(native)으로 변경 |

MySQL 8.0부터는 기본 인증 방식이 변경되어 있어서 이를 변경해주어야 한다.

## ⭕ 워드프레스 컨테이너 실행 시에 필요한 옵션과 인자
> docker run --name 컨테이너_이름 -dit --net=네트워크_이름 -p 호스트_포트:컨테이너_포트 -e WORDPRESS_DB_HOST=데이터베이스_컨테이너_이름:MySQL_포트 -e WORDPRESS_DB_NAME=데이터베이스_이름 -e WORDPRESS_DB_USER=데이터베이스_사용자_이름 -e WORDPRESS_DB_PASSWORD=데이터베이스_패스워드 wordpress

### ◉ 사용된 옵션
| 항목 | 옵션 | 설정값              |
|----|----|------------------|
| 네트워크 이름 | --net | wordpress000net1 |
| 워드프레스 컨테이너 이름 | --name | wordpress000ex12 |
| 실행 옵션 | --dit | -                |
| 포트 번호 설정 | -p | 8085:80          |
| 데이터베이스 컨테이너 이름 | -e WORDPRESS_DB_HOST | mysql000ex11     |
| 데이터베이스 이름 | -e WORDPRESS_DB_NAME | wordpress000db   |
| 데이터베이스 사용자 이름 | -e WORDPRESS_DB_USER | wordpress000kun  |
| 데이터베이스 패스워드 | -e WORDPRESS_DB_PASSWORD | wkunpass         |
