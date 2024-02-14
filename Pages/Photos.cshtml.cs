using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Module5.Pages;

public class PhotosModel : PageModel
{
    private readonly ILogger<PhotosModel> _logger;

    public IndexModel(ILogger<PhotosModel> logger)
    {
        _logger = logger;
    }

    public void OnGet()
    {
        string brand = "Photos";
        int yearStarted = 1999;
        viewData["Brand"] = brand + "Established" + yearStarted;
    }
}
