package vanq.demo.events.common;

public record Event<T>(
        EventMetadata metadata,
        T data
) {}