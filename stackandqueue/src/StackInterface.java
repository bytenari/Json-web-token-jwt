/**
 *
 * 자바 stack Interface입니다. <br>
 * StackInterface는 Stack에 의해 구현됩니다.
 *
 */


public interface StackInterface<E> {

    /**
     * 스택의 맨 위에 요소를 추가합니다.
     *
     * @param item 스택에 추가할 요소
     * @return 스택에 추가된 요소
     */
    E push(E item);

    /**
     * 스택의 맨 위에 있는 요소를 제거하고 제거 된 요소를 반환합니다.
     *
     * @return 제거 된 요소
     */
    E pop();

    /**
     * 스택의 맨 위에 있는 요소를 제거하지 않고 반환합니다.
     *
     * @return 스택의 맨 위에 있는 요소
     */
    E peek();

    /**
     * 스택의 요소 개수를 반환합니다.
     *
     * @return 스택에 있는 요소 개수를 반환
     */
    int size();

    /**
     * 스택에 있는 모든 요소를 삭제합니다.
     */
    void clear();

}