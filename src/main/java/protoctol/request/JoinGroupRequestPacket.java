package protoctol.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import protoctol.Packet;

import static protoctol.command.Command.JOIN_GROUP_REQUEST;

@EqualsAndHashCode(callSuper = true)
@Data
public class  JoinGroupRequestPacket extends Packet {
    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }
}
