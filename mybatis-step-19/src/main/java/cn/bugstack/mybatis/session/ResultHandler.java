package cn.bugstack.mybatis.session;

/**
 * @author 小傅哥，微信：fustack
 * @description 结果处理器
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ResultHandler {

    /**
     * 处理结果
     */
    void handleResult(ResultContext context);

}
