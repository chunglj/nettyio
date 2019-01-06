package protoctol.response;

import lombok.Data;
import protoctol.Packet;
import session.Session;

import static protoctol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data

public class GroupMessageResponsePacket extends Packet {
    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
