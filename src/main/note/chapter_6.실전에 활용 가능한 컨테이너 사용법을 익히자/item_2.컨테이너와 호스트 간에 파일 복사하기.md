아이템 2.컨테이너와 호스트 간에 파일 복사하기
=========================
## ⭕ 파일 복사
파일 복사는 컨테이너 <-> 호스트 양뱡향 모두 가능하다.

### ◉ 파일 복사 커맨드 docker cp(docker container cp)
> docker cp [옵션] 원본_경로 복사할_경로

---

## ⭕ [실습] 호스트의 파일을 컨테이너 속으로 복사
### ◉ 실습 내용
아파치 컨테이너 생성 및 실행 -> 파일 복사 -> 확인

### ◉ 생성할 컨테이너 정보
| 항목 | 값          |
|----|------------|
| 컨테이너 이름 | apa000ex19 |
| 이미지 이름   | httpd      |
| 포트 설정 | 8089:80     |

1. 아파치 컨테니어 생성
> docker run --name apa000ex19 -d -p 8089:80 httpd

2. 웹 브라우저를 통해 아파치에 접근해 초기 화면 확인
> http://localhost:8089

3. cp 커맨드를 실행해 호스트에서 컨테이너로 파일을 복사
> docker cp /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/index.html apa000ex19:/usr/local/apache2/htdocs

---

## ⭕ [실습] 컨테이너의 파일을 호스트로 복사
### ◉ 실습 내용
아파치 컨테이너 생성 및 실행 -> 파일 복사 -> 확인

### ◉ 생성할 컨테이너 정보
| 항목 | 값          |
|----|------------|
| 컨테이너 이름 | apa000ex19 |
| 이미지 이름   | httpd      |
| 포트 설정 | 8089:80     |

1. 아파치 컨테니어 생성
> docker run --name apa000ex19 -d -p 8089:80 httpd

2. cp 커맨드를 실행해 컨테이너에서 호스트로 파일을 복사
> docker cp apa000ex19:/usr/local/apache2/htdocs/index.html /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/index2.html
