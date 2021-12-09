package example.irina.irinaexam

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {

    lateinit var developersRecyclerView: RecyclerView
    lateinit var callUs: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val developersNames: List<String> = listOf("Maksim", "Irina")
        callUs = view.findViewById(R.id.call_us_button)

        developersRecyclerView = view.findViewById(R.id.developers_recycler_view)
        developersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developersRecyclerView.adapter = DevelopersAdapter(developersNames)

        callUs.setOnClickListener {
            val phoneNumber = Uri.parse("tel:+77777777777")
            val intent = Intent(Intent.ACTION_DIAL, phoneNumber)
            context?.startActivity(intent)
        }

        return view
    }


}