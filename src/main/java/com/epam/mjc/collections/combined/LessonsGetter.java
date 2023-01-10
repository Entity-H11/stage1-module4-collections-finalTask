package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        timetable.values().forEach(subjects -> subjects.forEach(lessons::add));
        return lessons;
    }
}
