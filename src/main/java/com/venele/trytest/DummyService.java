package com.venele.trytest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    public String concat(String before, String after) {
        StringBuilder sb = new StringBuilder();

        if (StringUtils.isNotBlank(before)) {
            sb.append(before);
        }

        if (StringUtils.isNotBlank(after)) {
            sb.append(after);
        }

        return sb.toString();
    }
}
