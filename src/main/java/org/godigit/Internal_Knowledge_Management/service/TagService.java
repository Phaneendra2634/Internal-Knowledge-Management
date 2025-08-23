package org.godigit.Internal_Knowledge_Management.service;

import lombok.RequiredArgsConstructor;
import org.godigit.ikm.entities.Tag;
import org.godigit.ikm.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    public Set<Tag> ensureTags(Set<String> names) {
        if (names == null || names.isEmpty()) return new HashSet<>();
        Set<Tag> out = new HashSet<>();
        for (String n : names) {
            var tag = tagRepository.findByNameIgnoreCase(n).orElseGet(() -> tagRepository.save(Tag.builder().name(n.trim()).build()));
            out.add(tag);
        }
        return out;
    }
}
