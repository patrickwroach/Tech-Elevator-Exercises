package com.techelevator;

public class FizzBuzz {

    private String divisor1;
    private String divisor2;
    String alternativeFizz;
    String alternativeBuzz;
    String number1;
    String number2;
    String number3;
    String number4;
    String number5;

    public String getDivisor1() {
        return divisor1;
    }

    public void setDivisor1(String divisor1) {
        this.divisor1 = divisor1;
    }

    public String getDivisor2() {
        return divisor2;
    }

    public void setDivisor2(String divisor2) {
        this.divisor2 = divisor2;
    }

    public String getAlternativeFizz() {
        return alternativeFizz;
    }

    public void setAlternativeFizz(String alternativeFizz) {
        this.alternativeFizz = alternativeFizz;
    }

    public String getAlternativeBuzz() {
        return alternativeBuzz;
    }

    public void setAlternativeBuzz(String alternativeBuzz) {
        this.alternativeBuzz = alternativeBuzz;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = buildFizzBuzz(number1);
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = buildFizzBuzz(number2);
    }

    public String getNumber3() {
        return number3;
    }

    public void setNumber3(String number3) {
        this.number3 = buildFizzBuzz(number3);
    }

    public String getNumber4() {
        return number4;
    }

    public void setNumber4(String number4) {
        this.number4 = buildFizzBuzz(number4);
    }

    public String getNumber5() {
        return number5;
    }

    public void setNumber5(String number5) {
        this.number5 = buildFizzBuzz(number5);
    }

    public String buildFizzBuzz(String number){
        if ((Integer.parseInt(number) % Integer.parseInt(divisor1) == 0) && (Integer.parseInt(number) % Integer.parseInt(divisor2) == 0)) {
            number = number + " " + alternativeFizz + alternativeBuzz;
        }
        else if (Integer.parseInt(number) % Integer.parseInt(divisor1) == 0) {
            number = number + " " + alternativeFizz;
        }
        else if (Integer.parseInt(number) % Integer.parseInt(divisor2) == 0) {
            number = number + " " + alternativeBuzz;
        }
        else {
            number = number;
        }
    return number;
    }
}
