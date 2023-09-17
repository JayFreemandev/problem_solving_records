package one;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * packageName    : one
 * fileName       : Remove_duplicate_ordered
 * author         : 정재윤
 * date           : 2023-09-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-17        정재윤       최초 생성
 */
public class Remove_duplicate_ordered {
    public List<Integer> calculate(List<Integer> numberList){
        Set<Integer> removeDuplicate = new LinkedHashSet<>(numberList);
        return new ArrayList<>(removeDuplicate);
    }
}
