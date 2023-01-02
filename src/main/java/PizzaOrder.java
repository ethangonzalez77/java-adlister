import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza-order")

public class PizzaOrder extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");

        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        System.out.println(size);
        System.out.println(sauce);
        System.out.println(crust);
        System.out.println(address);

        for (String topping : toppings) {
            System.out.println(topping);
        }
    }


}
