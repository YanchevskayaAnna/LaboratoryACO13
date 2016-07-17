package model;


public class Analysis {

    private long id;
    private String name;
    private String description;
    private long price;
    private int days;


    public Analysis(String name, String description, long price, int days) {
        this.id = Id.generateId();
        this.name = name;
        this.description = description;
        this.price = price;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Analysis analysis = (Analysis) o;

        if (id != analysis.id) return false;
        if (days != analysis.days) return false;
        if (name != null ? !name.equals(analysis.name) : analysis.name != null) return false;
        return !(description != null ? !description.equals(analysis.description) : analysis.description != null);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + days;
        return result;
    }

    @Override
    public String toString() {
        return "Analysis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", days=" + days +
                '}';
    }
}
