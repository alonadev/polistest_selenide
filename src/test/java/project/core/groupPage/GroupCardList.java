package project.core.groupPage;

import java.util.List;

public class GroupCardList {

    private final List<GroupCard> cards;

    public GroupCardList(List<GroupCard> cards) {
        this.cards = cards;
    }

    public GroupCard getCardByTitle(String title) {
        return cards.stream()
                .filter(
                        groupCard -> groupCard.getTitle()
                                 .equals(title)
                )
                .findFirst()
                .orElseThrow(
                        () -> {
                            return new IllegalStateException("Не удалось найти  группу с  именем " + title);
                        }
                );
    }
}
