package attributes;

import io.netty.util.AttributeKey;
import session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
