아이템 6.쿠버네티스 명령어
=========================
## ⭕ 쿠버테니스 명령어
kubectl 명령어의 형식
> kubectl [커맨드] [옵션]

#### ✦ 주요 kubectl 커맨드
| 커맨드 | 내용                               |
|----|----------------------------------|
| create | 리소스 생성                           |
| edit | 리소스 수정                           |
| delete | 리소스 삭제                           |
| get | 리소스의 상태를 출력                      |
| set | 리소스의 값을 설정                       |
| apply | 리소스의 변경 사항을 반영                   |
| describe | 리소스 상세 조회                        |
| diff | 바람직한 상태와 현재 상태의 차이를 확인           |
| expose | 여러 파드에 부하를 분산하는 새로운 서비스 오브젝트를 생성 |
| scale | 레플리카 수를 변경                       |
| autoscale | 자동 스케일링을 적용                      |
| rollout | 롤아웃을 수행                          |
| exec | 컨테이너에서 명령을 실행                    |
| run | 컨테이너에서 명령을 한번 실행                 |
| attach | 컨테이너에 접속                         |
| cp | 컨테이너에 파일을 복사                     |
| logs | 컨테이너의 로그를 출력                     |
| cluster-info | 클러스터 정보를 출력                      |
| top | CPU, 메모리, 스토리지 등 시스템 장원을 확인      |

쿠버네티스는 도커와는 달리, 매니페스트 파일의 내용에 따라 한 번에 모든 리소스를 생성한다. 또 바람직한 상태를 유지하는 과정을 직접 쿠버네티스가 제어하기 떄문에 명령어를 입력할 일이 많지 않다.

## ⭕ [실습] 매니페스트 파일로 파드 생성 - 디플로이먼트
### ◉ 실습 내용
매니페스트 파일을 읽어 실제 리소스에 반영 -> 파드의 생성 여부 확인

1. 디플로이먼트의 매니페스트파일을 읽어 들이기
> kubectl apply -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000dep.yml
2. 파드가 잘 생성됐는지 확인
> kubectl get pods

## ⭕ [실습] 매니페스트 파일로 파드 생성 - 서비스
### ◉ 실습 내용
매니페스트 파일을 읽어 실제 리소스에 반영 -> 서비스의 생성 여부 확인

1. 서비스의 매니페스트 파일을 읽어 들이기
> kubectl apply -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000ser.yml
2. 서비스가 잘 생성됐는지 확인
> kubectl get services
3. 동작 확인
http://localhost:30080에 접근해 확인

---

### 📌스터디 내용
