아이템 4.레드마인 및 MariaDB 컨테이너를 대상으로 연습하자
=========================
## ⭕ 레드마인 및 MySQL 컨테이너 생성
레드마인 역시 워드프로스와 동일한 구조로 레드마인 컨테이너와 MySQL 컨테이너로 구성된다.

### ◉ 실습 내용
네트워크 생성 -> MySQL 컨테이너 생성 -> 레드마인 컨테이너 생성 -> 확인 -> 뒷정리

### ◉ 생성할 네트워크 및 컨테이너 정보
| 항목 | 설정값            |
|----|----------------|
| 네트워크 이름 | redmine000net2 |
| MySQL 컨테이너 이름 | mysql000ex13   |
| MySQL 이미지 이름 | mysql          |
| 레드마인 컨테이너 이름 | redmine000ex14 |
| 레드마인 이미지 이름 | redmine        |

### ◉ 커맨드에서 사용할 옵션, 대상, 인자
네트워크 생성
> docker network create redmine000net2

MySQL 컨테이너 생성 및 실행
> docker run --name mysql000ex13 -dit --net=redmine000net2 -e MYSQL_ROOT_PASSWORD=myrootpass -e MYSQL_DATABASE=redmine000db -e MYSQL_USER=redmine000kun -e MYSQL_PASSWORD=rkunpass mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

MySQL 컨테이너 생성 및 실행 시 옵션 항목

| 항목 | 옵션 | 설정값 |
|----|----|-------|
| MySQL 컨테이너 이름 | --name | mysql000ex13 |
| MySQL 루트 패스워드 | -e MYSQL_ROOT_PASSWORD | myrootpass |
| MySQL 데이터베이스 이름 | -e MYSQL_DATABASE | redmine000db |
| MySQL 사용자 이름 | -e MYSQL_USER | redmine000kun |
| MySQL 패스워드 | -e MYSQL_PASSWORD | rkunpass |

MySQL 컨테이너 생성 및 실행 시 인자

| 항목 | 인자 | 값 | 의미                        |
|----|----|----|---------------------------|
| 문자 인코딩 | --character-set-server | utf8mb4 | 문자 인코딩으로 UTF8을 사용         |
| 정렬 순서 | --collation-server | utf8mb4_unicode_ci | 정렬 순서로 UTF8을 따름           |
| 인증 방식 | --default-authentication-plugin | mysql_native_password | 인증 방식을 예전 방식(native)으로 변경 |

레드마인 컨테이너의 생성 및 실행
> docker run --name redmine000ex14 -dit --net=redmine000net2 -p 8086:3000 -e REDMINE_DB_MYSQL=mysql000ex13 -e REDMINE_DB_DATABASE=redmine000db -e REDMINE_DB_USERNAME=redmine000kun -e REDMINE_DB_PASSWORD=rkunpass redmine

레드마인 컨테이너 생성 및 실행 시 옵션 항목

| 항목 | 옵션 | 설정값 |
|----|----|-------|
| 레드마인 컨테이너 이름 | --name | redmine000ex14 |
| 실행 옵션 | -dit | -                |
| 포트 번호 설정 | -p | 8086:3000          |
| 데이터베이스 컨테이너 이름 | -e REDMINE_DB_MYSQL | mysql000ex13 |
| 데이터베이스 이름 | -e REDMINE_DB_DATABASE | redmine000db |
| 데이터베이스 사용자 이름 | -e REDMINE_DB_USERNAME | redmine000kun |
| 데이터베이스 패스워드 | -e REDMINE_DB_PASSWORD | rkunpass |

## ⭕ 레드마인 및 MariaDB 컨테이너 만들기
MariaDB 컨테이너는 옵션 이름에 MYSQL_ROOT_PASSWORD, MYSQL_DATABASE와 같은 옵션 이름에 MYSQL이 들어간다.

##### ❗️ MySQL, MariaDB는 모두 개발자 미카엘 와이드니어스의 두 딸의 이름을 붙인 것이다. My는 장년, Maria는 차녀의 이름에서 유래되었다.

### ◉ 실습 내용
네트워크 생성 -> MariaDB 컨테이너 생성 -> 레드마인 컨테이너 생성 -> 확인 -> 뒷정리

### ◉ 생성할 네트워크 및 컨테이너 정보
| 항목 | 설정값            |
|----|----------------|
| 네트워크 이름 | redmine000net3 |
| MariaDB 컨테이너 이름 | mariadb000ex15 |
| MariaDB 이미지 이름 | mariadb          |
| 레드마인 컨테이너 이름 | redmine000ex16 |
| 레드마인 이미지 이름 | redmine        |

### ◉ 커맨드에서 사용할 옵션, 대상, 인자
네트워크 생성
> docker network create redmine000net3

MariaDB 컨테이너 생성 및 실행
> docker run --name mariadb000ex15 -dit --net=redmine000net3 -e MYSQL_ROOT_PASSWORD=mariarootpass -e MYSQL_DATABASE=redmine000db -e MYSQL_USER=redmine000kun -e MYSQL_PASSWORD=rkunpass mariadb --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

MariaDB 컨테이너 생성 및 실행 시 옵션 항목

| 항목 | 옵션 | 설정값 |
|----|----|-------|
| MariaDB 컨테이너 이름 | --name | mariadb000ex15 |
| 실행 옵션 | -dit | -                |
| MariaDB 루트 패스워드 | -e MYSQL_ROOT_PASSWORD | mariarootpass |
| MariaDB 데이터베이스 이름 | -e MYSQL_DATABASE | redmine000db |
| MariaDB 사용자 이름 | -e MYSQL_USER | redmine000kun |
| MariaDB 패스워드 | -e MYSQL_PASSWORD | rkunpass |

MariaDB 컨테이너 생성 및 실행 시 인자

| 항목 | 인자 | 설정값 |
|----|----|-------|
| 문자 인코딩 | --character-set-server | utf8mb4 |
| 정렬 순서 | --collation-server | utf8mb4_unicode_ci |

레드마인 컨테이너의 생성 및 실행
> docker run --name redmine000ex16 -dit --net=redmine000net3 -p 8087:3000 -e REDMINE_DB_MYSQL=mariadb000ex15 -e REDMINE_DB_DATABASE=redmine000db -e REDMINE_DB_USERNAME=redmine000kun -e REDMINE_DB_PASSWORD=rkunpass redmine

레드마인 컨테이너 생성 및 실행 시 옵션 항목

| 항목 | 옵션 | 설정값 |
|----|----|-------|
| 레드마인 컨테이너 이름 | --name | redmine000ex16 |
| 포트 번호 설정 | -p | 8087:3000          |
| 데이터베이스 컨테이너 이름 | -e REDMINE_DB_MYSQL | mariadb000ex15 |

### ◉ 뒷정리
컨테이너/이미지/네트워크 종료 및 삭제
> docker stop mariadb000ex15 redmine000ex16
> docker rm mariadb000ex15 redmine000ex16
> docker rmi mariadb redmine
> docker network rm redmine000net3

---

