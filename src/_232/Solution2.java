package _232;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author lining
 * @date 18-11-15 @实现思路：双队列实现栈
 */
public class Solution2<E> {

    private Queue<E> queue = new LinkedBlockingQueue<>();
    private Queue<E> queue2 = new LinkedBlockingQueue<>();

    /**
     * 添加无素
     * 
     * @param e
     */
    void add(E e) {
        if (queue.isEmpty() && queue2.isEmpty()) {
            queue.add(e);
        } else if (queue.isEmpty()) {
            queue.add(e);

            while (!queue2.isEmpty()) {
                queue.add(queue2.poll());
            }
        } else if (queue2.isEmpty()) {
            queue2.add(e);

            while (!queue.isEmpty()) {
                queue2.add(queue.poll());
            }
        }

    }

    /**
     * 从队列头取元素，并移除元素
     * 
     * @return
     */
    E poll() {
        if (queue.isEmpty() && queue2.isEmpty()) {
            return null;
        }
        if (queue.isEmpty()) {
            return queue2.poll();
        } else {
            return queue.poll();
        }
    }

    /**
     * 从队列头取元素
     *
     * @return
     */
    E element() {
        if (queue.isEmpty() && queue2.isEmpty()) {
            return null;
        }
        if (queue.isEmpty()) {
            return queue2.element();
        } else {
            return queue.element();
        }
    }

    boolean empty() {
        return queue2.isEmpty() && queue.isEmpty();
    }

    void print() {
        System.out.println(this.element());
    }

    void printAndPoll() {
        System.out.println(this.poll());
    }

}
