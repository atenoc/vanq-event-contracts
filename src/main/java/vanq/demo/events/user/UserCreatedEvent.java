package vanq.demo.events.user;

import java.util.UUID;

public record UserCreatedEvent(
        UUID id,
        String email,
        String name
) {}
