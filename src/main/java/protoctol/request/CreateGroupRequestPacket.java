package protoctol.request;

import lombok.Data;
import protoctol.Packet;

import java.util.List;

import static protoctol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}

