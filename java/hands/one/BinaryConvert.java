package one;

/**
 * packageName    : one
 * fileName       : BinaryConvert
 * author         : 정재윤
 * date           : 2023-09-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-17        정재윤       최초 생성
 */
public class BinaryConvert {

    public int 이진수를10진수로(String number){
        return Integer.valueOf(number, 2);
    }

    public String 십진수를2진수로(int number){
        return Integer.toString(number, 2);
    }

    public int 십육진수를10진수로(String number){
        return Integer.parseInt(number, 16);
    }

}
