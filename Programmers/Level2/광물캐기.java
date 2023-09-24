import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : 광물캐기
 * author         : 정재윤
 * date           : 2023-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-22        정재윤       최초 생성
 */
public class 광물캐기 {

    public static void main(String[] args) {

    }

    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        int[][] arr = new int[][]{{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};
        int size = Arrays.stream(picks).sum();
        List<Mineral> list = new ArrayList<>();

        for (int i = 0; i < minerals.length; i += 5) {
            if (size == 0) {
                break;
            }

            int diamond = 0;
            int iron = 0;
            int stone = 0;

            for (int j = i; j < i + 5; j++) {

                if (j == minerals.length) {
                    break;
                }

                // 기본값 다이아 광물
                int mineral = 0;

                if (minerals[j].equals("iron")) {
                    mineral = 1;
                }

                if (minerals[j].equals("stone")) {
                    mineral = 2;
                }

                diamond += arr[0][mineral];
                iron += arr[1][mineral];
                stone += arr[2][mineral];
            }

            list.add(new Mineral(diamond, iron, stone));
            size--;
        }

        Collections.sort(list, ((o1, o2) -> (o2.stone - o1.stone)));

        for (Mineral mineral : list) {
            int diamond = mineral.diamond;
            int iron = mineral.iron;
            int stone = mineral.stone;

            if (picks[0] > 0) {
                answer += diamond;
                picks[0]--;
                continue;
            }

            if (picks[1] > 0) {
                answer += iron;
                picks[1]--;
                continue;
            }

            if (picks[2] > 0) {
                answer += stone;
                picks[2]--;

            }
        }

        return answer;
    }

    class Mineral {
        private int diamond;
        private int iron;
        private int stone;

        public Mineral(int diamond, int iron, int stone) {
            this.diamond = diamond;
            this.iron = iron;
            this.stone = stone;
        }
    }
}
