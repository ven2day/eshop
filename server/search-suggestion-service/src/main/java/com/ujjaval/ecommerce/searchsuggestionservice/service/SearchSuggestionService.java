package com.ventoday.ecommerce.searchsuggestionservice.service;

import com.ventoday.ecommerce.searchsuggestionservice.dto.SearchSuggestionKeywordInfo;
import java.util.List;

public interface SearchSuggestionService {
    void loadSearchSuggestionToMap();

    List<SearchSuggestionKeywordInfo> searchKeywordFromMap(String q);

    List<SearchSuggestionKeywordInfo> getDefaultSearchSuggestions();
}

