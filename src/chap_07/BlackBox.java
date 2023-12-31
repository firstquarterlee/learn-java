package chap_07;

// 진짜 클래스를 만들때는 첫글자를 대문자!
public class BlackBox {
    // 인스턴스변수 또는 필드라고 함
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 넘버

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)

    static boolean canAutoReport = false; // 자동 신고 기능

    BlackBox() {
        /*System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);*/
    }

    BlackBox(String modelName, String resolution, int price, String color) {
/*        this(); // 기본생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;*/
    }


    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    // 게터는 값을 가져오는거고 세터는 값을 설정하는거다.

    String getModelName() {
        return modelName; // 이게 게터
    }

    void setModelName(String modelName) {
        this.modelName = modelName; // 이게 세터
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
        this.price = price;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
