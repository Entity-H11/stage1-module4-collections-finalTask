package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsFromDev = new ArrayList<>();

        projects.forEach((project, devs) -> {
            devs.forEach(dev -> {
                if (dev.equals(developer))
                    projectsFromDev.add(project);
            });
        });
        projectsFromDev.sort((s1, s2) -> {
            int comparingResult = Integer.compare(s2.length(), s1.length());
            if (comparingResult != 0)
                return comparingResult;
            else
                return s2.compareTo(s1);
        });
        return projectsFromDev;
    }
}
