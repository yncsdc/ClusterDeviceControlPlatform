package cc.bitky.clustermanage.server.message.web;

import cc.bitky.clustermanage.server.message.MsgType;
import cc.bitky.clustermanage.server.message.base.WebMsgBaseEmployee;

/**
 * 服务器部署员工姓名
 */
public class WebMsgDeployEmployeeName extends WebMsgBaseEmployee {
    public WebMsgDeployEmployeeName(int groupId, int boxId, String value) {
        super(groupId, boxId, value);
        setMsgId(MsgType.SERVER_SET_EMPLOYEE_NAME);
    }
}
