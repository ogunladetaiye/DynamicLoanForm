package com.aliumujib.loanpoc.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aliumujib.loanpoc.R
import com.aliumujib.loanpoc.models.Section

class FormSectionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form_section, container, false)
    }


    companion object {
        val SECTION_ID = "SECTION_ID"
        @JvmStatic
        fun newInstance(section: Section) =
                FormSectionFragment().apply {
                    arguments = Bundle().apply {
                        putParcelable(SECTION_ID, section)
                    }
                }
    }
}
