compareTo

按字典(ASCII)顺序比较两个字符串。

当String的前几位相同,返回this.length()-other.length();

当String的length()相同,返回第一个不同字符(i)的ASCII差值(this.charAt(i)-other.charAt());

当String第一位不同,直接第一个字符的ASCII差值(this.charAt(0)-other.charAt(0)).

