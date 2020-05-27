package person.grafie.leetcode.tests.no155;

import java.util.LinkedList;
import java.util.List;

class MinStack {
    private List<Integer> list;

    private int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
        setMinWithPush(x);
    }

    private void setMinWithPush(int x) {
        if (min > x) {
            min = x;
        }
    }

    private void updateMinWithPop() {
        if (list.isEmpty()) {
            min = Integer.MAX_VALUE;
        } else {
            int newMin = list.get(0);
            for (int i : list) {
                if (newMin > i) {
                    newMin = i;
                }
            }
            min = newMin;
        }
    }

    public void pop() {
        list.remove(list.size() - 1);
        updateMinWithPop();

    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }
}
