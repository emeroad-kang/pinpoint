package com.nhn.pinpoint.profiler.context;

import com.nhn.pinpoint.bootstrap.context.TraceContext;

/**
 * @author emeroad
 */
public class MockTraceContextFactory {
    public TraceContext create() {
        DefaultTraceContext traceContext = new DefaultTraceContext() ;
        return traceContext;
    }
}