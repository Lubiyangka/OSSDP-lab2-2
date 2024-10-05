import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2022211836_4_Test {
    private Solution4 solution;
    /**
     * 测试目的：验证当数组元素个数小于 2 时，算法能正确返回 0。
     * 测试用例：{10}
     * 等价类：数组长度小于2
     */

    @BeforeEach
    void setSolution() {
        solution = new Solution4();
    }
    @Test
    public void testArrayWithSingleElement() {
        int[] nums = {10};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证一个无序的中小型数组中相邻元素之间最大差值的正确性。
     * 测试用例：{3, 6, 9, 1}
     * 等价类：中小型数组，元素分布相对均匀
     */
    @Test
    public void testSmallUnorderedArray() {
        int[] nums = {3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证有序数组中最大相邻元素差值的正确性。
     * 测试用例：{1, 2, 3, 4, 5}
     * 等价类：已经有序的数组
     */
    @Test
    public void testSortedArray() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证极端情况下元素差距很大的数组的表现。
     * 测试用例：{1, 3, 100}
     * 等价类：有极大值差距的数组
     */
    @Test
    public void testLargeGapArray() {
        int[] nums = {1, 3, 100};
        assertEquals(97, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证包含多个数量级数据的数组中的最大差值。
     * 测试用例：{1, 10, 100, 1000}
     * 等价类：数量级差别较大的数组
     */
    @Test
    public void testArrayWithMultipleOrdersOfMagnitude() {
        int[] nums = {1, 10, 100, 1000};
        assertEquals(900, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证重复元素的数组能否正确处理。
     * 测试用例：{5, 5, 5, 5}
     * 等价类：所有元素相同的数组
     */
    @Test
    public void testArrayWithSameElements() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证空数组的情况能否正确处理。
     * 测试用例：{}
     * 等价类：空数组
     */
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, solution.maximumGap(nums));
    }


}