package vanq.demo.events.common;

import java.time.Instant;
import java.util.UUID;

public record EventMetadata(
        UUID eventId,
        Instant occurredAt,
        String eventType,
        Integer version
) {}