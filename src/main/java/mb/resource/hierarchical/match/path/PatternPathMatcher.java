package mb.resource.hierarchical.match.path;

import mb.resource.hierarchical.ResourcePath;
import org.checkerframework.checker.nullness.qual.Nullable;

public class PatternPathMatcher implements PathMatcher {
    private final AntPattern pattern;

    public PatternPathMatcher(AntPattern pattern) {
        this.pattern = pattern;
    }

    @Override public boolean matches(ResourcePath path, ResourcePath rootDir) {
        final String relative = rootDir.relativize(path).toString();
        return pattern.match(relative);
    }

    @Override public boolean equals(@Nullable Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        final PatternPathMatcher that = (PatternPathMatcher) o;
        return pattern.equals(that.pattern);
    }

    @Override public int hashCode() {
        return pattern.hashCode();
    }

    @Override public String toString() {
        return "PatternPathMatcher(" + pattern + ")";
    }
}
