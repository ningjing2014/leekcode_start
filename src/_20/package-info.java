/**
 * Copyright(c) 2011-2018 by YouCredit Inc. All Rights Reserved<br>
 *
 * 描述：<br>
 *   给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
 *          判断二者是否相等，并返回结果。 # 代表退格字符。<br>
 *
 * 示例 1：<br>
 *
 * 输入：S = "ab#c", T = "ad#c"<br>
 * 输出：true<br>
 * 解释：S 和 T 都会变成 “ac”。<br>
 * 示例 2：<br>
 *
 * 输入：S = "ab##", T = "c#d#"<br>
 * 输出：true<br>
 * 解释：S 和 T 都会变成 “”。<br>
 * 示例 3：<br>
 *
 * 输入：S = "a##c", T = "#a#c"<br>
 * 输出：true<br>
 * 解释：S 和 T 都会变成 “c”。<br>
 * 示例 4：<br>
 *
 * 输入：S = "a#c", T = "b"<br>
 * 输出：false<br>
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。<br>
 */
package _20;