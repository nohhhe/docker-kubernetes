아이템 7.매니페스트 파일로 파드의 개수 늘리기
=========================
## ⭕ [실습] 매니페스트 파일로 파드의 개수 늘리기
### ◉ 실습 내용
레플리카의 수 변경 -> 매니페스트파일을 다시 읽어 리소스에 반영 -> 파드가 생성됐는지 확인

1. 디플로이먼트의 매니페스트 파일 수정
2. 매니페스트 파일 다시 읽기
> kubectl apply -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000dep.yml
3. 파드의 수가 늘어났는지 확인
> kubectl get pods

## ⭕ [실습] 매니페스트 파일로 아파치를 nginx로 바꾸기
### ◉ 실습 내용
이미지의 종류 수정 -> 매니페스트 파일을 다시 읽어 리소스에 반영 -> nginx 컨테이너로 바뀌었는지 확인

1. 디플로이먼트의 매니페스트 파일 수정
2. 매니페스트 파일 다시 읽기
> kubectl apply -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000dep.yml
3. 동작 확인
http://localhost:30080에 접근해 확인

## ⭕ [실습] 수동으로파드를 삭제한 후 자동복구되는지 확인
### ◉ 실습 내용
명령어로 파드를 하나 삭제 -> 파드가 삭제됐는지 확인 -> 새로운 파드가 보충됐는지 확인

1. get 커맨드로 파드의 목록 확인
> kubectl get pods
2. 수동으로 delete 커맨드를 실행해 파드를 하나 삭제
> kubectl delete pod [파드 이름]
3. 삭제된 파드가 다시 보충되는지 확인
> kubectl get pods

## ⭕ [실습] 생성했던 디플로이먼트와 서비스 삭제
### ◉ 실습 내용
디플로이먼트 삭제 -> 삭제 확인 -> 서비스 삭제 -> 삭제 확인

1. delete 커맨드로 디플로이먼트 삭제
> kubectl delete -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000dep.yml
2. 디플로이먼트의 삭제 확인
> kubectl get deployment
3. delete 커맨드로 서비스 삭제
> kubectl delete -f /Users/hhnho/workspace/docker-kubernetes/src/main/resources/example/kubernetes/apa000ser.yml
4. 서비스의 삭제 확인
> kubectl get services
---

## ⭕
### ◉
> 

#### ✦
| 항목 | 내용 |
|----|----|
|  |    |
|  |    |
|  |    |
|  |    |
|  |    |

##### ❓
* a
* b
* c
##### ❗️


--- 

### 📌스터디 내용
