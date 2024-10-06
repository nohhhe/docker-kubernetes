아이템 2.서버와 도커
=========================
### 서버의 두 가지 의미
도커는 서버에서 사용되는 소프트웨어다. 클라이언트 컴퓨터에서도 사용할 수는 있지만 현시점에서는 서버에서 사용하는 것이 주 목적이라고 생각한다.

서버란 무엇일까? 서버는 이름 그대로 어떤 서비스를 제공하는 것을 가리킨다.

### 기능적 의미의 서버와 물리적 컴퓨터로서의 서버
특정한 기능을 제공하는 것은 기능적 의미의 서버를 가르키고 데스크톱 컴퓨터와 마찬가지로 어딘가에 물리적으로 존재하는 서버를 물리적 컴퓨터로서의 서버라고 한다.

하나의 물리적 서버는 여러 개의 기능적 서버를 함께 둘 수 있다.

### 서버의 기능은 소프트웨어가 제공한다.
서버의 기능은 소프트웨어가 제공하는 거스올, 소프트웨어를 설치하면 서버의 기능을 갖게 된다.

서버의 기능이 소프트웨어에서 나온다는 말은 여러 가지 소프트웨어를 한 컴퓨터에 설치할 수도 있다.

### 서버의 운영체제로는 주로 리눅스가 사용된다.
서버용 운영체제로는 리눅스 또는 유닉스 게열을 주로 사용하며, 서버용 소프트웨어도 리눅스용 소프트웨어가 대다수를 차지한다.
윈도우도 서버용 버전이 따로 있지만 점유율이 낮다.

<table>
  <tr>
    <th style="text-align:center">운영체제 계열</th>
    <th style="text-align:center">운영체제</th>
    <th style="text-align:center">서버 종류</th>
  </tr>
  <tr>
    <td style="text-align:center">윈도우 계열</td>
    <td style="text-align:center">윈도우</td>
    <td style="text-align:center">윈도우</td>
  </tr>
  <tr>
    <td rowspan="7" style="text-align:center">유닉스 계열</td>
    <td style="text-align:center">리눅스</td>
    <td style="text-align:center">Red Hat, CentOS</td>
  </tr>
  <tr>
    <td style="text-align:center">리눅스</td>
    <td style="text-align:center">Debian, Ubuntu</td>
  </tr>
  <tr>
    <td style="text-align:center">리눅스</td>
    <td style="text-align:center">SUSE, openSUSE</td>
  </tr>
  <tr>
    <td rowspan="3" style="text-align:center">BSD</td>
    <td style="text-align:center">macOS</td>
  </tr>
  <tr>
    <td style="text-align:center">FreeBSD</td>
  </tr>
  <tr>
    <td style="text-align:center">NetBSD</td>
  </tr>
  <tr>
    <td style="text-align:center">솔라리스</td>
    <td style="text-align:center">Solaris, OpenSolaris</td>
  </tr>
</table>

### 컨테이너를 이용해 여러 가지 서버 기능을 안전하게 함께 실행하기
일반적으로 한 대의 서버 컴퓨터에는  웹 서버를 한 벌 밖에 실행하지 못한다. 그러나 컨테이너 기술을 화룡하면 여러 개의 웹 서버를 올릴 수 있다.

물리 서버 한대에 여러 개의 웹 서버를 띄우면 물리 서버를 줄여 비용을 절감할 수 있다.

개발 측면에서는 개발환경을 갖추거나 운영환경으로 쉽게 넘어갈 수 있다는 점이 있다.

### 자유로이 옮길 수 있는 컨테이너
도커만 설치돼 있으면 운영체제가 달라도 이를 신경 쓰지 않고 컨테이너를 옮길 수 있다.
도커를 이용하면 물리적 환경의 차이, 서버 구성의 차이를 무시할 수 있으므로 운영 서버와 개발 서버의 환경 차이로 인한 문제를 원천적으로 방지할 수 있다.

### 도커와 가상화 기술의 차이
가상화 기술은 하이퍼바이저를 통해 물리적인 서버 위에 운영체제 전체를 가상화하는 방식이고 도커는 리눅스 컨테이너를 이용해 애플리케이션 레벨에서 격리된 환경을 제공한다.

#### 도커와 AWS EC2의 차이
AWS EC2에도 도커의 컨테이너와 비슷한 인스턴스라는 개념이 있다. 그러나 EC2 역시 가상화 기술이다. 다만 AMI라는 이미지로부터 생성하므로 인스턴스를 배포하는 방법은 도커와 비슷하다.

> EC2 인스턴스 안에 도커를 설치해 사용할 수 있다. 이 경우 EC2 인스턴스는 도커 호스트가 되어 도커 컨테이너를 실행할 수 있다.

#### 도커와 호스팅 서비스
AWS ECS를 사용하면 별도로 가상 서버를 만들지 않아도 컨테이너 이미지를 그대로 실행할 수 있다.

> AWS 내부적으로 인스턴스를 관리하지 서버 자체가 없는 것은 아니다. 다만 사용자가 직접 관리하지 않을 뿐이다.
 
![스크린샷 2024-10-07 00.24.18.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fj1%2F5ql_ff2s5bqcsc32szpjt41m0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_KONyvT%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-10-07%2000.24.18.png)

#### ECS와 EKS
모두 AWS 컨테이너화된 애플리케이션을 관리하는 서비스이지만 ECS는 AWS 고유의 컨테이너 관리 서비스이고, EKS는 쿠버네티스를 사용하여 컨테이너를 관리하는 서비스이다.

| **항목**           | **ECS (Elastic Container Service)**                 | **EKS (Elastic Kubernetes Service)**                |
|--------------------|----------------------------------------------------|----------------------------------------------------|
| **기반 기술**      | AWS 고유의 컨테이너 관리 서비스                        | 오픈 소스 Kubernetes 기반 컨테이너 관리 서비스       |
| **오케스트레이션 도구** | ECS 자체의 오케스트레이션 시스템을 사용                   | Kubernetes를 기반으로 클러스터 오케스트레이션      |
| **배포 방식**      | AWS 전용, AWS 인프라에 최적화                         | 오픈 소스 Kubernetes, 멀티 클라우드 및 온프레미스도 사용 가능 |
| **유연성**         | AWS에 최적화, 간단하게 사용 가능                      | Kubernetes의 복잡하고 강력한 기능을 활용 가능       |
| **운영 관리**      | AWS가 대부분 자동 관리, 사용자는 애플리케이션 관리에 집중   | Kubernetes 클러스터의 컨트롤 플레인은 AWS가 관리, 워커 노드는 사용자가 관리 |
| **멀티 클라우드 지원** | AWS 전용                                             | Kubernetes 기반으로, 멀티 클라우드 및 온프레미스 환경에서 일관성 있게 사용 가능 |
| **확장성**         | 매우 유연하며 Fargate를 통해 서버리스도 지원             | Kubernetes의 네이티브 확장성 및 오토스케일링 지원   |


