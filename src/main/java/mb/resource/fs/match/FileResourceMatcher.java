package mb.resource.fs.match;

import mb.resource.fs.FSResource;
import org.checkerframework.checker.nullness.qual.Nullable;

public class FileResourceMatcher implements ResourceMatcher {
    @Override public boolean matches(FSResource resource, FSResource rootDirectory) {
        return resource.isFile();
    }

    @Override public boolean equals(@Nullable Object o) {
        return this == o || (o != null && getClass() == o.getClass());
    }

    @Override public int hashCode() {
        return 0;
    }

    @Override public String toString() {
        return "FileResourceMatcher()";
    }
}