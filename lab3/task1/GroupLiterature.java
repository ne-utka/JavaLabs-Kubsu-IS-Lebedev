public class GroupLiterature {
    private String groupId;
    private Literature[] items;

    public GroupLiterature() {
        this.groupId = "";
        this.items = new Literature[0];
    }

    public GroupLiterature(String groupId, Literature[] items) {
        this.groupId = groupId;
        this.items = items != null ? items : new Literature[0];
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Literature[] getItems() {
        return items;
    }

    public void setItems(Literature[] items) {
        this.items = items != null ? items : new Literature[0];
    }

    public Literature getItem(int index) {
        if (index < 0 || index >= items.length) {
            return null;
        }
        return items[index];
    }

    public void setItem(int index, Literature item) {
        if (index < 0 || index >= items.length) {
            return;
        }
        items[index] = item;
    }

    public void addItem(Literature item) {
        if (item == null) {
            return;
        }
        Literature[] next = new Literature[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            next[i] = items[i];
        }
        next[items.length] = item;
        items = next;
    }

    public boolean removeBySourceCode(String sourceCode) {
        if (sourceCode == null) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            Literature item = items[i];
            if (item != null && sourceCode.equals(item.getSourceCode())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        Literature[] next = new Literature[items.length - 1];
        int pos = 0;
        for (int i = 0; i < items.length; i++) {
            if (i != index) {
                next[pos++] = items[i];
            }
        }
        items = next;
        return true;
    }

    public void sortByYear() {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].getYear() < items[minIndex].getYear()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Literature temp = items[i];
                items[i] = items[minIndex];
                items[minIndex] = temp;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupLiterature{groupId='").append(groupId).append("', items=[");
        for (int i = 0; i < items.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(items[i]);
        }
        sb.append("]}");
        return sb.toString();
    }
}
