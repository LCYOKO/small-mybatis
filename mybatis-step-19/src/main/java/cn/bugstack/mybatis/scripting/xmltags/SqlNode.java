package cn.bugstack.mybatis.scripting.xmltags;

/**
 * @author 小傅哥，微信：fustack
 * @description SQL 节点
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface SqlNode {

    boolean apply(DynamicContext context);

}