package com.ngnis.walle.web;

import com.ngnis.walle.center.board.GroupBoardCenter;
import com.ngnis.walle.center.board.SendGroupMessageDTO;
import com.ngnis.walle.common.result.BaseResult;
import com.ngnis.walle.core.auth.CheckToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 发送消息的api
 *
 * @author houyi.wh
 * @since 2018-09-14
 */
@Slf4j
@RestController
@RequestMapping(ApiConstant.Urls.MESSAGE)
public class MessageController extends BaseController {

    @Resource
    private GroupBoardCenter boardCenter;

    /**
     * 发送消息
     */
    @CheckToken
    @PostMapping(ApiConstant.Urls.MESSAGE_SEND_GROUP_MSG)
    public BaseResult sendMessage(@RequestBody SendGroupMessageDTO messageDTO) {
        SendGroupMessageDTO newMessageDTO = newGroupMessageDTO(messageDTO);
        return boardCenter.sendGroupMessage(newMessageDTO);
    }


}

